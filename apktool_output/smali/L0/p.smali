.class public final Ll0/p;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# static fields
.field public static final f:Ll0/p;

.field public static final g:Ll0/p;


# instance fields
.field public final synthetic e:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Ll0/p;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll0/p;-><init>(II)V

    sput-object v0, Ll0/p;->f:Ll0/p;

    new-instance v0, Ll0/p;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll0/p;-><init>(II)V

    sput-object v0, Ll0/p;->g:Ll0/p;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Ll0/p;->e:I

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll0/p;->e:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll0/n;

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_0
    check-cast p1, LW/F;

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
