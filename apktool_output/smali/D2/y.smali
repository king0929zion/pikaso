.class public final LD2/y;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# static fields
.field public static final f:LD2/y;

.field public static final g:LD2/y;

.field public static final h:LD2/y;


# instance fields
.field public final synthetic e:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, LD2/y;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LD2/y;-><init>(II)V

    sput-object v0, LD2/y;->f:LD2/y;

    new-instance v0, LD2/y;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LD2/y;-><init>(II)V

    sput-object v0, LD2/y;->g:LD2/y;

    new-instance v0, LD2/y;

    const/4 v1, 0x2

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LD2/y;-><init>(II)V

    sput-object v0, LD2/y;->h:LD2/y;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, LD2/y;->e:I

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LD2/y;->e:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, LD2/A;

    check-cast p2, Lg2/g;

    return-object p1

    :pswitch_0
    check-cast p1, Ly2/j0;

    check-cast p2, Lg2/g;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, p2, Ly2/j0;

    if-eqz p1, :cond_1

    check-cast p2, Ly2/j0;

    move-object p1, p2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_1
    check-cast p2, Lg2/g;

    instance-of v0, p2, Ly2/j0;

    if-eqz v0, :cond_5

    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    check-cast p1, Ljava/lang/Integer;

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    const/4 v0, 0x1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_2

    :cond_3
    move p1, v0

    :goto_2
    if-nez p1, :cond_4

    move-object p1, p2

    goto :goto_3

    :cond_4
    add-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :cond_5
    :goto_3
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
