.class public final synthetic LA2/c;
.super Lp2/f;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# static fields
.field public static final l:LA2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, LA2/c;

    const-string v4, "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, LA2/d;

    const-string v3, "createSegment"

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lp2/f;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v6, LA2/c;->l:LA2/c;

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    move-object v3, p2

    check-cast v3, LA2/j;

    sget-object p1, LA2/d;->a:LA2/j;

    new-instance p1, LA2/j;

    iget-object v4, v3, LA2/j;->h:LA2/b;

    invoke-static {v4}, Lp2/g;->b(Ljava/lang/Object;)V

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, LA2/j;-><init>(JLA2/j;LA2/b;I)V

    return-object p1
.end method
