.class public final LA0/g;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# static fields
.field public static final f:LA0/g;

.field public static final g:LA0/g;


# instance fields
.field public final synthetic e:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, LA0/g;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LA0/g;-><init>(II)V

    sput-object v0, LA0/g;->f:LA0/g;

    new-instance v0, LA0/g;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LA0/g;-><init>(II)V

    sput-object v0, LA0/g;->g:LA0/g;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, LA0/g;->e:I

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LA0/g;->e:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, LA0/a;

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    check-cast p1, Ljava/util/List;

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
