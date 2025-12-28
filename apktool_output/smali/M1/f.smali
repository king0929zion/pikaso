.class public final LM1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LM1/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LM1/f;->a:I

    packed-switch v0, :pswitch_data_0

    .line 13
    new-instance v0, Lz1/E;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lz1/E;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    :pswitch_0
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 15
    sget-object p1, Lm1/b;->e:Lm1/a;

    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "superState must be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :pswitch_1
    new-instance v0, Lk/T0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lk/T0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 18
    :pswitch_2
    new-instance v0, Lk/F0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lk/F0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 19
    :pswitch_3
    new-instance v0, La2/A;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, La2/A;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 20
    :pswitch_4
    new-instance v0, LY1/c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LY1/c;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 21
    :pswitch_5
    new-instance v0, LS1/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LS1/a;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 22
    :pswitch_6
    new-instance v0, LQ0/f;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LQ0/f;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 23
    :pswitch_7
    new-instance v0, LN1/b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LN1/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 24
    :pswitch_8
    new-instance v0, LM1/g;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LM1/g;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LM1/f;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    new-instance v0, Lz1/E;

    invoke-direct {v0, p1, p2}, Lz1/E;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 2
    :pswitch_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 3
    sget-object p1, Lm1/b;->e:Lm1/a;

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "superState must be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :pswitch_1
    new-instance v0, Lk/T0;

    invoke-direct {v0, p1, p2}, Lk/T0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 6
    :pswitch_2
    new-instance v0, Lk/F0;

    invoke-direct {v0, p1, p2}, Lk/F0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 7
    :pswitch_3
    new-instance v0, La2/A;

    invoke-direct {v0, p1, p2}, La2/A;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 8
    :pswitch_4
    new-instance v0, LY1/c;

    invoke-direct {v0, p1, p2}, LY1/c;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 9
    :pswitch_5
    new-instance v0, LS1/a;

    invoke-direct {v0, p1, p2}, LS1/a;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 10
    :pswitch_6
    new-instance v0, LQ0/f;

    invoke-direct {v0, p1, p2}, LQ0/f;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 11
    :pswitch_7
    new-instance v0, LN1/b;

    invoke-direct {v0, p1, p2}, LN1/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 12
    :pswitch_8
    new-instance v0, LM1/g;

    invoke-direct {v0, p1, p2}, LM1/g;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, LM1/f;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lz1/E;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lm1/b;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lk/T0;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lk/F0;

    return-object p1

    :pswitch_3
    new-array p1, p1, [La2/A;

    return-object p1

    :pswitch_4
    new-array p1, p1, [LY1/c;

    return-object p1

    :pswitch_5
    new-array p1, p1, [LS1/a;

    return-object p1

    :pswitch_6
    new-array p1, p1, [LQ0/f;

    return-object p1

    :pswitch_7
    new-array p1, p1, [LN1/b;

    return-object p1

    :pswitch_8
    new-array p1, p1, [LM1/g;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
