.class public final LB/c;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public final synthetic e:J

.field public final synthetic f:Lv0/B;

.field public final synthetic g:LL/a;

.field public final synthetic h:I


# direct methods
.method public constructor <init>(JLv0/B;LL/a;I)V
    .locals 0

    iput-wide p1, p0, LB/c;->e:J

    iput-object p3, p0, LB/c;->f:Lv0/B;

    iput-object p4, p0, LB/c;->g:LL/a;

    iput p5, p0, LB/c;->h:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v4, p1

    check-cast v4, LD/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, LB/c;->h:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LD/d;->J(I)I

    move-result v5

    iget-object v3, p0, LB/c;->g:LL/a;

    iget-wide v0, p0, LB/c;->e:J

    iget-object v2, p0, LB/c;->f:Lv0/B;

    invoke-static/range {v0 .. v5}, LB/a;->a(JLv0/B;LL/a;LD/n;I)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
