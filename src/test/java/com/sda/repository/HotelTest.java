package com.sda.repository;

import com.sda.model.Room;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    //given
   private Hotel hotel = new Hotel();

    @Test
    void new_hotel_has_10_rooms() {
//        assertEquals(10, hotel.getRooms().size());
        assertThat(hotel.getRooms().size()).isEqualTo(10); // wersja na assertJ
    }

    @Test
    void should_find_correct_room_by_given_number() {
        //when
        Room roomFound = hotel.findRoomByNumber(5);
        //than
        assertThat(roomFound.getNumber()).isEqualTo(5);
    }

    @Test
    void should_throw_exception_if_not_found() {
        //when
        //than
        assertThrows(NoSuchElementException.class, ()-> hotel.findRoomByNumber(15));
        assertThatThrownBy(()-> hotel.findRoomByNumber(15))
                .isInstanceOf(NoSuchElementException.class);
    }


}
