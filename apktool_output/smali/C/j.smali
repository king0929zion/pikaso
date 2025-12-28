.class public abstract LC/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lv0/B;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v10, LF0/e;

    sget v0, LF0/d;->a:F

    const/4 v1, 0x0

    invoke-direct {v10, v1, v0}, LF0/e;-><init>(IF)V

    sget-object v0, Lv0/B;->d:Lv0/B;

    sget-object v9, LB/a;->a:Lv0/q;

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v11, 0xe7ffff

    invoke-static/range {v0 .. v11}, Lv0/B;->a(Lv0/B;JLz0/l;Lz0/r;JJLv0/q;LF0/e;I)Lv0/B;

    move-result-object v0

    sput-object v0, LC/j;->a:Lv0/B;

    return-void
.end method
