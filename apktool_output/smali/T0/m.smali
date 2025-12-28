.class public final Lt0/m;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# static fields
.field public static final f:Lt0/m;

.field public static final g:Lt0/m;

.field public static final h:Lt0/m;

.field public static final i:Lt0/m;

.field public static final j:Lt0/m;

.field public static final k:Lt0/m;

.field public static final l:Lt0/m;

.field public static final m:Lt0/m;

.field public static final n:Lt0/m;

.field public static final o:Lt0/m;


# instance fields
.field public final synthetic e:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lt0/m;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lt0/m;-><init>(II)V

    sput-object v0, Lt0/m;->f:Lt0/m;

    new-instance v0, Lt0/m;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lt0/m;-><init>(II)V

    sput-object v0, Lt0/m;->g:Lt0/m;

    new-instance v0, Lt0/m;

    const/4 v1, 0x2

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lt0/m;-><init>(II)V

    sput-object v0, Lt0/m;->h:Lt0/m;

    new-instance v0, Lt0/m;

    const/4 v1, 0x2

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lt0/m;-><init>(II)V

    sput-object v0, Lt0/m;->i:Lt0/m;

    new-instance v0, Lt0/m;

    const/4 v1, 0x2

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lt0/m;-><init>(II)V

    sput-object v0, Lt0/m;->j:Lt0/m;

    new-instance v0, Lt0/m;

    const/4 v1, 0x2

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lt0/m;-><init>(II)V

    sput-object v0, Lt0/m;->k:Lt0/m;

    new-instance v0, Lt0/m;

    const/4 v1, 0x2

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lt0/m;-><init>(II)V

    sput-object v0, Lt0/m;->l:Lt0/m;

    new-instance v0, Lt0/m;

    const/4 v1, 0x2

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lt0/m;-><init>(II)V

    sput-object v0, Lt0/m;->m:Lt0/m;

    new-instance v0, Lt0/m;

    const/4 v1, 0x2

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lt0/m;-><init>(II)V

    sput-object v0, Lt0/m;->n:Lt0/m;

    new-instance v0, Lt0/m;

    const/4 v1, 0x2

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lt0/m;-><init>(II)V

    sput-object v0, Lt0/m;->o:Lt0/m;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lt0/m;->e:I

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lt0/m;->e:I

    packed-switch v0, :pswitch_data_0

    if-nez p1, :cond_0

    move-object p1, p2

    :cond_0
    return-object p1

    :pswitch_0
    check-cast p1, Lt0/a;

    check-cast p2, Lt0/a;

    new-instance v0, Lt0/a;

    if-eqz p1, :cond_1

    iget-object v1, p1, Lt0/a;->a:Ljava/lang/String;

    if-nez v1, :cond_2

    :cond_1
    iget-object v1, p2, Lt0/a;->a:Ljava/lang/String;

    :cond_2
    if-eqz p1, :cond_3

    iget-object p1, p1, Lt0/a;->b:Lc2/c;

    if-nez p1, :cond_4

    :cond_3
    iget-object p1, p2, Lt0/a;->b:Lc2/c;

    :cond_4
    invoke-direct {v0, v1, p1}, Lt0/a;-><init>(Ljava/lang/String;Lc2/c;)V

    return-object v0

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Float;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    if-eqz p1, :cond_5

    invoke-static {p1}, Ld2/k;->j0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object p2, p1

    :cond_5
    return-object p2

    :pswitch_4
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    return-object p1

    :pswitch_5
    check-cast p1, Lt0/e;

    check-cast p2, Lt0/e;

    iget p2, p2, Lt0/e;->a:I

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "merge function called on unmergeable property PaneTitle."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_7
    check-cast p1, Lc2/m;

    check-cast p2, Lc2/m;

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    if-eqz p1, :cond_6

    invoke-static {p1}, Ld2/k;->j0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object p2, p1

    :cond_6
    return-object p2

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
