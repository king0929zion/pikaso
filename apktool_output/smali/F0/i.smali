.class public final LF0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/j;


# static fields
.field public static final a:LF0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF0/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LF0/i;->a:LF0/i;

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0
.end method

.method public final b()J
    .locals 2

    sget v0, LW/r;->g:I

    sget-wide v0, LW/r;->f:J

    return-wide v0
.end method

.method public final c()LW/D;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
